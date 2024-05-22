// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCultivationSpren<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cultivationspren"), "main");
	private final ModelPart Vine1;
	private final ModelPart Vine2;
	private final ModelPart Vine3;
	private final ModelPart Vine4;
	private final ModelPart Vine5;
	private final ModelPart Vine6;
	private final ModelPart Vine7;
	private final ModelPart Head;
	private final ModelPart legs;
	private final ModelPart legs2;
	private final ModelPart legs3;
	private final ModelPart legs4;

	public ModelCultivationSpren(ModelPart root) {
		this.Vine1 = root.getChild("Vine1");
		this.Vine2 = root.getChild("Vine2");
		this.Vine3 = root.getChild("Vine3");
		this.Vine4 = root.getChild("Vine4");
		this.Vine5 = root.getChild("Vine5");
		this.Vine6 = root.getChild("Vine6");
		this.Vine7 = root.getChild("Vine7");
		this.Head = root.getChild("Head");
		this.legs = root.getChild("legs");
		this.legs2 = root.getChild("legs2");
		this.legs3 = root.getChild("legs3");
		this.legs4 = root.getChild("legs4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Vine1 = partdefinition.addOrReplaceChild("Vine1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Vine1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(27, 21).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r2 = Vine1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(27, 27).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r3 = Vine1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(6, 30).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r4 = Vine1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(30, 6).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r5 = Vine1.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 30).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r6 = Vine1.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(30, 12).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Vine2 = partdefinition.addOrReplaceChild("Vine2", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 24.0F, 2.0F));

		PartDefinition cube_r7 = Vine2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(24, 24).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r8 = Vine2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(3, 27).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r9 = Vine2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(27, 9).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r10 = Vine2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(15, 27).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r11 = Vine2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(27, 15).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r12 = Vine2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(21, 27).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Vine3 = partdefinition.addOrReplaceChild("Vine3", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 23.0F, 3.0F));

		PartDefinition cube_r13 = Vine3.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r14 = Vine3.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r15 = Vine3.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(12, 24).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r16 = Vine3.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(24, 12).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r17 = Vine3.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(18, 24).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r18 = Vine3.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(24, 18).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Vine4 = partdefinition.addOrReplaceChild("Vine4", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 22.0F, 7.0F));

		PartDefinition cube_r19 = Vine4.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(18, 18).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r20 = Vine4.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(3, 21).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r21 = Vine4.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(21, 9).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r22 = Vine4.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(15, 21).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r23 = Vine4.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(21, 15).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r24 = Vine4.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(21, 21).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Vine5 = partdefinition.addOrReplaceChild("Vine5", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 21.0F, 5.0F));

		PartDefinition cube_r25 = Vine5.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(15, 9).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r26 = Vine5.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(15, 15).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r27 = Vine5.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(6, 18).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r28 = Vine5.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(18, 6).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r29 = Vine5.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(12, 18).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r30 = Vine5.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(18, 12).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Vine6 = partdefinition.addOrReplaceChild("Vine6", CubeListBuilder.create(),
				PartPose.offset(-8.0F, 23.0F, 9.0F));

		PartDefinition cube_r31 = Vine6.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r32 = Vine6.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(12, 0).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r33 = Vine6.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(12, 12).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r34 = Vine6.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(3, 15).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r35 = Vine6.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(15, 3).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r36 = Vine6.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(9, 15).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Vine7 = partdefinition.addOrReplaceChild("Vine7", CubeListBuilder.create(),
				PartPose.offset(-8.0F, 21.0F, 9.0F));

		PartDefinition cube_r37 = Vine7.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r38 = Vine7.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(3, 3)
						.addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r39 = Vine7.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(6, 6).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r40 = Vine7.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(3, 9).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -1.0F, -5.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r41 = Vine7.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(9, 3).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition cube_r42 = Vine7.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(9, 9).addBox(-2.0F, -2.0F, -2.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, -0.7812F, -0.0721F, -1.2498F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(34, 18)
						.addBox(-3.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 6)
						.addBox(-2.0F, -4.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-2.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 3)
						.addBox(-3.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 33)
						.addBox(-1.0F, -3.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 32)
						.addBox(-1.0F, -3.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 32)
						.addBox(-3.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(-2.0F, -6.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(-3.0F, -6.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 21)
						.addBox(-2.0F, -4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(-2.0F, -4.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 33)
						.addBox(-4.0F, -4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 9)
						.addBox(-4.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 33)
						.addBox(-3.0F, -4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 33)
						.addBox(-3.0F, -4.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 15)
						.addBox(-2.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 12)
						.addBox(-3.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r43 = Head.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(24, 30).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -6.0F, 4.0F, 0.8399F, -0.3195F, 0.4383F));

		PartDefinition cube_r44 = Head.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(30, 24).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -6.0F, 5.0F, 1.1677F, -0.268F, -0.1631F));

		PartDefinition cube_r45 = Head.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(31, 27).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.0F, 5.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(12, 35)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 35)
						.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition legs2 = partdefinition.addOrReplaceChild("legs2",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 31)
						.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 24.0F, -3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition legs3 = partdefinition.addOrReplaceChild("legs3",
				CubeListBuilder.create().texOffs(34, 29)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 25)
						.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 24.0F, -2.0F, 0.0F, 2.5307F, 0.0F));

		PartDefinition legs4 = partdefinition.addOrReplaceChild("legs4",
				CubeListBuilder.create().texOffs(24, 34)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 23)
						.addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 24.0F, 0.0F, 0.0F, 2.138F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Vine1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Vine2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Vine3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Vine4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Vine5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Vine6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Vine7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}